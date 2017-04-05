package br.com.gersonkm.swkata.datetime.dat_003;

import org.jetbrains.annotations.NotNull;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DAT_003_A_Java implements DAT_003_A {

    @NotNull @Override
    public Set<LocalDate> solve(@NotNull LocalDate data)  {
        LocalDate d = data;
        Set<LocalDate> lista = new LinkedHashSet<>();

        while(d.getDayOfWeek() != DayOfWeek.SUNDAY){
           d =  d.plusDays(-1);
        }

        while (d.getDayOfWeek() != DayOfWeek.SATURDAY || d.getDayOfMonth() == d.getMonth().maxLength()){
            if (d.getDayOfWeek() != DayOfWeek.SATURDAY && d.getDayOfWeek() != DayOfWeek.SUNDAY ){
                lista.add(d);
            }
            d = d.plusDays(1);
        }
        return lista;
    }
}
