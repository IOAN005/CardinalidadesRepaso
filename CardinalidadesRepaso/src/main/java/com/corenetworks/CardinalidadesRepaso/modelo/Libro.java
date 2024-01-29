package com.corenetworks.CardinalidadesRepaso.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="libros")
public class Libro {
    @Id
    @Column(length = 20)
    private String isbn;
    @Column(length = 60,nullable = false)
    private String titulo;
    @Column(length = 60,nullable = false)
    private String autor;
    @Column(nullable = false)
    private double importe;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_editorial",foreignKey = @ForeignKey(name = "FK_libros_editoriales"))
    private Editorial editorial;

}
