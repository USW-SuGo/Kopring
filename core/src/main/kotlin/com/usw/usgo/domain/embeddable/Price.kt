package com.usw.usgo.domain.embeddable

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
class Price(

    @Column(nullable = false)
    val value: Int,
)