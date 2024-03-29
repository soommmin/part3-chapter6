package android.part3_chapter6

import android.annotation.SuppressLint
import android.part3_chapter6.model.ListItem
import androidx.recyclerview.widget.DiffUtil


class DiffCallback<T : ListItem> : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T) =
        oldItem.viewType == newItem.viewType && oldItem.getKey() == newItem.getKey()


    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: T, newItem: T) = oldItem == newItem

}