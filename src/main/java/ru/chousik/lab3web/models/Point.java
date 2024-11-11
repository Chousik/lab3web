package ru.chousik.lab3web.models;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "points")
@NoArgsConstructor
public final class Point {
    @Id
    @Column(name="id", nullable=false, unique=true)
    private int id;

    @Column(name = "x", nullable=false)
    private double x;

    @Column(name = "y", nullable=false)
    private double y;

    @Column(name = "r", nullable=false)
    private double r;

    @Column(name = "in_flag", nullable=false)
    private boolean inFlag;

    @Column(name = "time", nullable=false)
    private String time;

    @Column(name = "execution_time", nullable=false)
    private long executionTime;
}
