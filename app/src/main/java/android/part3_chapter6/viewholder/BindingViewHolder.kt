package android.part3_chapter6.viewholder

import android.part3_chapter6.BR
import android.part3_chapter6.model.ListItem
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView


abstract class BindingViewHolder<VB : ViewDataBinding>(
    private val binding: VB,
) : RecyclerView.ViewHolder(binding.root) {

    protected var item: ListItem? = null

    open fun bind(item: ListItem) {
        this.item = item
        binding.setVariable(BR.item, this.item)
    }
}