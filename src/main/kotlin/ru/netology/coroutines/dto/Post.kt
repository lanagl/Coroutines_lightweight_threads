package ru.netology.coroutines.dto

open class Post(
    open val id: Long,
    open val authorId: Long,
    open val content: String,
    open val published: Long,
    open val likedByMe: Boolean,
    open val likes: Int = 0,
    open var attachment: Attachment? = null,
)

data class PostWithAuthor(
    override val id: Long,
    override val authorId: Long,
    var author: Author?,
    override val content: String,
    override val published: Long,
    override val likedByMe: Boolean,
    override val likes: Int = 0,
    override var attachment: Attachment? = null,
) : Post(id, authorId, content, published, likedByMe, likes, attachment)