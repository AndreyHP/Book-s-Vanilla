package com.books.api.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private int publicationYear;

    @Column(nullable = false)
    private String Isbn;

    @Column(nullable = false)
    private String photo;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private String synopsis;

    @Column(nullable = false)
    private LocalDate launch;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "VARCHAR(13) DEFAULT 'DISPONIVEL'")
    private Status status = Status.DISPONIVEL;


    public enum Status {
        DISPONIVEL,
        INDISPONIVEL
    }

}