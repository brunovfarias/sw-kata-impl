package br.com.gersonkm.swkata.collectionpipeline.cpi_001;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CPI_001_C_Java implements CPI_001_C {

    @NotNull @Override
    public SortedMap<Integer, Livro> solve(@NotNull List<Livro> livros) {
        return livros.stream()
                .collect(Collectors.toMap(Livro::getId
                        , Function.identity()
                        , (l1, l2) -> l1
                        , TreeMap::new)
                );
    }
}