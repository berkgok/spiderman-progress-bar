package the.amazing.spidermanprogressbar;


import javax.swing.*;
import java.util.Objects;

public interface Icons {
    ImageIcon SPIDERMAN = new ImageIcon(Objects.requireNonNull(Icons.class.getResource("/spiderman.gif")));
    ImageIcon SPIDERMAN_HEAD = new ImageIcon(Objects.requireNonNull(Icons.class.getResource("/spiderman-head.gif")));
    ImageIcon REVERSE_SPIDERMAN_HEAD = new ImageIcon(Objects.requireNonNull(Icons.class.getResource("/spiderman-head-reversed.gif")));
}
