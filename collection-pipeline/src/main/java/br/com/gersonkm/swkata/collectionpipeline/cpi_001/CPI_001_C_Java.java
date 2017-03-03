package br.com.gersonkm.swkata.collectionpipeline.cpi_001;

import org.apache.commons.lang3.NotImplementedException;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;

public class CPI_001_C_Java implements CPI_001_C {

    @NotNull @Override
    public SortedMap<Integer, Livro> solve(@NotNull List<Livro> livros) {
        return livros.stream()
                .sorted(Comparator.comparing(Livro::getId))
                .collect(Collectors.toMap(Livro::getId, it -> it, (l1,l2) -> l1, TreeMap::new));
    }
}