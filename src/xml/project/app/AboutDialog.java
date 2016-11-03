package xml.project.app;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.custom.ScrolledComposite;

public class AboutDialog extends TitleAreaDialog
{
    private StyledText styledText;

    /**
     * Create the dialog.
     * 
     * @param parentShell
     */
    public AboutDialog(Shell parentShell)
    {
        super(parentShell);
    }

    /**
     * Create contents of the dialog.
     * 
     * @param parent
     */
    @Override
    protected Control createDialogArea(Composite parent)
    {
        this.setTitle("About");
        this.setMessage("XML-Editor\n" + "© 2015 Team Name");

        Composite area = (Composite) super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setBackground(SWTResourceManager
                .getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
        container.setLayout(new FillLayout(SWT.HORIZONTAL));
        container.setLayoutData(new GridData(GridData.FILL_BOTH));
        {
            final ScrolledComposite scrolledComposite = new ScrolledComposite(
                    container, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
            scrolledComposite.setExpandHorizontal(true);
            scrolledComposite.setExpandVertical(true);
            {
                styledText = new StyledText(scrolledComposite, SWT.NONE);
                styledText.setDoubleClickEnabled(false);
                styledText.setEditable(false);
                styledText.setSelectionBackground(SWTResourceManager
                        .getColor(SWT.COLOR_WHITE));
                styledText
                        .setText("\t XML-Editor\n"
                                + "\n"
                                + "\t GUI Designed by: \n"
                                + "\t\t\t Ahmed Badr \n"
                                + "\n"
                                + "\t\t\t Email: Ahmed.amh.badr123@gmail.com \n"
                                + "\n"
                                + "\t Developers: \n"
                                + "\t\t\t Ahmed Badr: JAXP Method \n"
                                + "\t\t\t Shaher Nadr: DOM Method \n"
                                + "\t\t\t Maria Tawfik: JDOM Method \n"
                                );
                styledText.setFont(SWTResourceManager.getFont("Lucida Grande",
                        10, SWT.NORMAL));
                styledText.setBackground(SWTResourceManager
                        .getColor(SWT.COLOR_WHITE));
            }
            scrolledComposite.setContent(styledText);
            scrolledComposite.setMinSize(styledText.computeSize(SWT.DEFAULT,
                    SWT.DEFAULT));
        }

        return area;
    }

    /**
     * Create contents of the button bar.
     * 
     * @param parent
     */
    @Override
    protected void createButtonsForButtonBar(Composite parent)
    {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
                true);
        Button button = createButton(parent, IDialogConstants.CANCEL_ID,
                IDialogConstants.CANCEL_LABEL, false);
        button.setEnabled(false);
    }

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize()
    {
        return new Point(450, 300);
    }
}
