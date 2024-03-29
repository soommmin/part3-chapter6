package android.part3_chapter6.viewholder

import android.part3_chapter6.ListAdapter
import android.part3_chapter6.databinding.ItemViewPagerBinding
import android.part3_chapter6.model.ListItem
import android.part3_chapter6.model.ViewPager


class ViewPagerViewHolder(
    binding: ItemViewPagerBinding,
) : BindingViewHolder<ItemViewPagerBinding>(binding) {

    private val adapter = ListAdapter()

    init {
        binding.viewpager.adapter = adapter
    }

    override fun bind(item: ListItem) {
        super.bind(item)
        item as ViewPager
        adapter.submitList(item.items)
    }
}