/**
 * 
 */
package xml.project.app.methods;

import java.io.FileNotFoundException;
import java.nio.file.Path;

import javax.xml.bind.JAXBException;

/**
 * @author Ahmed Badr
 *
 */
public interface XMLEngine
{

    public void writeFile(Object booksCatalog, Path filePath)
            throws JAXBException;

    public Object readFile(Path filePath)
            throws JAXBException, FileNotFoundException;

}
