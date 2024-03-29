package android.part3_chapter6.remote.repository

import android.part3_chapter6.model.ListItem
import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow

interface MainRepository {

    fun loadList() : Flow<PagingData<ListItem>>
}