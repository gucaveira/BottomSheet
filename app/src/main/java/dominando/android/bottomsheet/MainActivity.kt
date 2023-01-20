package dominando.android.bottomsheet

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior.*
import dominando.android.bottomsheet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnBottomSheet.setOnClickListener {
            val behavior = from(
                binding.includeLayoutBottomSheet.layoutBottomSheet
            )

            if (behavior.state == STATE_HIDDEN || behavior.state == STATE_EXPANDED) {

                behavior.state = STATE_COLLAPSED

            } else if (behavior.state == STATE_COLLAPSED) {

                behavior.state = STATE_EXPANDED
            }

            behavior.addBottomSheetCallback(object : BottomSheetCallback() {
                override fun onSlide(view: View, slideOffset: Float) {}

                override fun onStateChanged(view: View, newState: Int) {}
            })
        }
    }
}
