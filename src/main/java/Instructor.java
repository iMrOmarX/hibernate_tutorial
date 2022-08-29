import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "instructor")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name= "email")
    private String email;

    @OneToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_details_id")
    @ToString.Exclude
    private InstructorDetails instructorDetails;

    @OneToMany(mappedBy = "instructor",
    cascade = {CascadeType.DETACH, CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
    private List<Course> courses;


    public void add(Course course) {
        if(this.courses == null) {
            courses = new ArrayList<>();
        }
        courses.add(course);
        course.setInstructor(this);
    }

}
