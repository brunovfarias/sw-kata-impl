@file:Suppress("unused", "UNUSED_PARAMETER")

package ru.yole.kxdate

import java.time.Duration
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Period

object ago

object fromNow

val Int.nanoseconds: java.time.Duration
    get() = java.time.Duration.ofNanos(toLong())

val Int.microseconds: java.time.Duration
    get() = java.time.Duration.ofNanos(toLong() * 1000L)

val Int.milliseconds: java.time.Duration
    get() = java.time.Duration.ofMillis(toLong())

val Int.seconds: java.time.Duration
    get() = java.time.Duration.ofSeconds(toLong())

val Int.minutes: java.time.Duration
    get() = java.time.Duration.ofMinutes(toLong())

val Int.hours: java.time.Duration
    get() = java.time.Duration.ofHours(toLong())

val Int.days: java.time.Period
    get() = java.time.Period.ofDays(this)

val Int.weeks: java.time.Period
    get() = java.time.Period.ofWeeks(this)

val Int.months: java.time.Period
    get() = java.time.Period.ofMonths(this)

val Int.years: java.time.Period
    get() = java.time.Period.ofYears(this)

val java.time.Duration.ago: java.time.LocalDateTime
    get() =  baseTime() - this

val Duration.fromNow: LocalDateTime
    get() =  baseTime() + this

val Period.ago: LocalDate
    get() = baseDate() - this

val Period.fromNow: LocalDate
    get() = baseDate() + this

infix fun Int.nanoseconds(fromNow: fromNow) = baseTime().plusNanos(toLong())

infix fun Int.nanoseconds(ago: ago) = baseTime().minusNanos(toLong())

infix fun Int.microseconds(fromNow: fromNow) = baseTime().plusNanos(1000L * toLong())

infix fun Int.microseconds(ago: ago) = baseTime().minusNanos(1000L * toLong())

infix fun Int.milliseconds(fromNow: fromNow) = baseTime().plusNanos(1000000L * toLong())

infix fun Int.milliseconds(ago: ago) = baseTime().minusNanos(1000000L * toLong())

infix fun Int.seconds(fromNow: fromNow) = baseTime().plusSeconds(toLong())

infix fun Int.seconds(ago: ago) = baseTime().minusSeconds(toLong())

infix fun Int.minutes(fromNow: fromNow) = baseTime().plusMinutes(toLong())

infix fun Int.minutes(ago: ago) = baseTime().minusMinutes(toLong())

infix fun Int.hours(fromNow: fromNow) = baseTime().plusHours(toLong())

infix fun Int.hours(ago: ago) = baseTime().minusHours(toLong())

infix fun Int.days(fromNow: fromNow) = baseDate().plusDays(toLong())

infix fun Int.days(ago: ago) = baseDate().minusDays(toLong())

infix fun Int.weeks(fromNow: fromNow) = baseDate().plusWeeks(toLong())

infix fun Int.weeks(ago: ago) = baseDate().minusWeeks(toLong())

infix fun Int.months(fromNow: fromNow) = baseDate().plusMonths(toLong())

infix fun Int.months(ago: ago) = baseDate().minusMonths(toLong())

infix fun Int.years(fromNow: fromNow) = baseDate().plusYears(toLong())

infix fun Int.years(ago: ago) = baseDate().minusYears(toLong())

private fun baseDate() = LocalDate.now()

private fun baseTime() = LocalDateTime.now()
