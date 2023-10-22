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
@Table(name = "Profesores")
public class Teacher implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profesores_id")
    Long id;
    @Column(name = "profesores_nombre")
    String nombre;
    @Column(name = "profesores_dni")
    String dni;
    @Column(name = "profesores_correo")
    String correo;
    @Column(name = "profesor_clase_fecha")
    String clasefecha;
}
