import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBar extends JPanel {
	private JButton helloButton;
	private JButton goodbyeButton;

	public ToolBar() {
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");

		setLayout(new FlowLayout());

		add(helloButton);
		add(goodbyeButton);

	}

}
