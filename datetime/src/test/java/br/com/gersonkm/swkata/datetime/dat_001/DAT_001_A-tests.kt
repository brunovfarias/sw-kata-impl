package br.com.gersonkm.swkata.datetime.dat_001

import br.com.gersonkm.swkata.datetime.helpers.DateTimeTestHelper
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.Test
import org.threeten.extra.Days
import org.threeten.extra.Weeks
import java.time.DayOfWeek


abstract class DAT_001_A_Tests(val SUT: DAT_001_A) {

    @Test
    fun `dia não util`() {
        var result = SUT.solve(DateTimeTestHelper.newLocalDate("06/03/2017"), Weeks.of(1), Days.of(5))

        assertThat(result).isEqualTo(DateTimeTestHelper.newLocalDate("18/03/2017"))
    }

    @Test
    fun `dia util`() {
        var result = SUT.solve(DateTimeTestHelper.newLocalDate("06/03/2017"), Weeks.of(1), Days.of(5),true)

        assertThat(result).isEqualTo(DateTimeTestHelper.newLocalDate("20/03/2017"))
    }

    @Test
    fun `dia util com padrao quarta`() {
        var result = SUT.solve(DateTimeTestHelper.newLocalDate("06/03/2017"), Weeks.of(1), Days.of(5),true, DayOfWeek.WEDNESDAY)
        assertThat(result).isEqualTo(DateTimeTestHelper.newLocalDate("22/03/2017"))
    }

    @Test
    fun `dia util com padrao exception`() {
        var result = SUT.solve(DateTimeTestHelper.newLocalDate("06/03/2017"), Weeks.of(1), Days.of(5),true, DayOfWeek.WEDNESDAY)
        assertThatExceptionOfType(IllegalArgumentException::class.java)
    }
}

class DAT_001_A_Java_Tests : DAT_001_A_Tests(DAT_001_A_Java())
class DAT_001_A_Kotlin_Tests : DAT_001_A_Tests(DAT_001_A_Kotlin())