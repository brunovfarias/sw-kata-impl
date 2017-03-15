package br.com.gersonkm.swkata.datetime.dat_001

import br.com.gersonkm.swkata.datetime.helpers.DateTimeTestHelper.newLocalDate
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatExceptionOfType
import org.junit.Test
import org.threeten.extra.Days
import org.threeten.extra.Weeks
import java.time.DayOfWeek

abstract class DAT_001_A_Tests(val SUT: DAT_001_A) {

    @Test
    fun `adiciona dias e semanas`() {
        var result = SUT.solve(data = newLocalDate("06/03/2017"), semanas = Weeks.of(1), dias = Days.of(5))
        assertThat(result).isEqualTo(newLocalDate("18/03/2017"))
    }

    @Test
    fun `subtrai dias e semanas`() {
        var result = SUT.solve(data = newLocalDate("06/03/2017"), semanas = Weeks.of(-1), dias = Days.of(-5))
        assertThat(result).isEqualTo(newLocalDate("22/02/2017"))
    }

    @Test
    fun `força o resultado como dia util`() {
        var result = SUT.solve(data = newLocalDate("06/03/2017"), semanas = Weeks.of(1), dias=Days.of(5), forcaDiaUtil =  true)
        assertThat(result).isEqualTo(newLocalDate("20/03/2017"))
    }

    @Test
    fun `força o resultado como proxima quarta feira`() {
        var result = SUT.solve(data = newLocalDate("06/03/2017"), semanas = Weeks.of(1), dias=Days.of(5), forcaDiaUtil = true, diaUtilPadrao = DayOfWeek.WEDNESDAY)
        assertThat(result).isEqualTo(newLocalDate("22/03/2017"))
    }

    @Test
    fun `forca dia util com parametro proximo dia util invalido`() {
        var result = SUT.solve( data = newLocalDate("06/03/2017"), semanas = Weeks.of(1), dias = Days.of(5), forcaDiaUtil=true,  diaUtilPadrao = DayOfWeek.WEDNESDAY)
        assertThatExceptionOfType(IllegalArgumentException::class.java)
    }
}

class DAT_001_A_Java_Tests : DAT_001_A_Tests(DAT_001_A_Java())
class DAT_001_A_Kotlin_Tests : DAT_001_A_Tests(DAT_001_A_Kotlin())