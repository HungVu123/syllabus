package com.group.syllabus.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SyllabusUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int unitNo;
    private String name;
    private int duration;

    @ManyToOne(fetch = FetchType.LAZY)
    private SyllabusSession syllabusunitsession;

    @OneToMany(
            mappedBy = "syllabusunitchapter",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<SyllabusUnitChapter> syllabusunitchapter = new ArrayList<>();
    // private trainerId;
}
