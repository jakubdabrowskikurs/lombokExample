import lombok.*;

import java.util.Date;

@ToString(callSuper=true, includeFieldNames=false)
//@ToString
@AllArgsConstructor
@RequiredArgsConstructor
public class Lombok {

    @Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC)
    private String name;

    @Getter(AccessLevel.PROTECTED) @Setter(AccessLevel.PROTECTED)
    @ToString.Exclude private int age;

    @Getter @Setter
    private Date date;
}
