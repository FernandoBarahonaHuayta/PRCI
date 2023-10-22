package models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Alumnos")
public class Student implements Serializable {

    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alumno_id")
    Long id;
    @Column(name = "alumno_nombre")
    String nombre;
    @Column(name = "alumno_dni")
    String dni;
    @Column(name = "alumno_correo")
    String correo;

}
