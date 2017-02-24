package br.com.gersonkm.swkata.collectionpipeline.cpi_000;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class CPI_000_A_Java implements CPI_000_A {

    @NotNull @Override
    public List<String> solve(@NotNull List<CoffeeBrand> coffeeBrands) {
        return coffeeBrands.stream()
                .map(CoffeeBrand::getName)
                .collect(Collectors.toList());
    }

}