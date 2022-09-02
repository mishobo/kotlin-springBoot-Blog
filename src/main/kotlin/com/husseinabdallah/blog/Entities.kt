package com.husseinabdallah.blog

import toSlug
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Article (
    @Id @GeneratedValue
    var id: Long? = null,
    var title: String,
    var headline: String,
    var content: String,
    @ManyToOne
    var author: User,
    var slug: String = title.toSlug(),

    )

@Entity
class User(
    @Id @GeneratedValue
    var id: Long? = null,
    var login: String,
    var firstname: String,
    var lastname: String,
    var description: String? = null,
    )