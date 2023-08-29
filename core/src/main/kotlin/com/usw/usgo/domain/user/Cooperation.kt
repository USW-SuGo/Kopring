package com.usw.usgo.domain.user

import jakarta.persistence.Embeddable
import java.time.LocalDateTime

@Embeddable
class Cooperation(
    var tradeAttemptCount: Int = 0,
    var recentUpPost: LocalDateTime = LocalDateTime.now(),
    var recentEvaluationManner: LocalDateTime = LocalDateTime.now(),
) {
}
