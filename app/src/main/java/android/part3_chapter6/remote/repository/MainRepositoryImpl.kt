package android.part3_chapter6.remote.repository

import android.part3_chapter6.remote.MainPagingSource
import android.part3_chapter6.remote.MainService
import androidx.paging.Pager
import androidx.paging.PagingConfig

import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val mainService: MainService
) : MainRepository {

    override fun loadList() = Pager(
        config = PagingConfig(
            pageSize = 20,
            enablePlaceholders = false
        ),
        pagingSourceFactory = {
            MainPagingSource(mainService)
        }
    ).flow
}