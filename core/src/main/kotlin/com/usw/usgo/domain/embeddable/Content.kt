package com.usw.usgo.domain.embeddable

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
class Content(

    @Column(nullable = false)
    val value: String,
)