package dominando.android.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dominando.android.bottomsheet.databinding.LayoutBottomDialogBinding

class BottomDialog : BottomSheetDialogFragment() {

    private lateinit var binding: LayoutBottomDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = LayoutBottomDialogBinding.inflate(inflater, container, false)
        binding.btnConfirm.setOnClickListener { dismiss() }
        binding.btnCancel.setOnClickListener { dismiss() }

        return binding.root
    }
}
