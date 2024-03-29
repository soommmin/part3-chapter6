package android.part3_chapter6.model

import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("imageUrl")
    val imageUrl : String
) : ListItem {
    override val viewType: ViewType
        get() = ViewType.IMAGE
}
