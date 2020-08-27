package pack3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class ProDocumentWorker extends DocumentWorker{


    @Override
    public void saveDocument() {
        super.saveDocument();
        System.out.println("Документ отредактирован.");
    }

    @Override
    public void editDocument() {
        super.editDocument();
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт.");
    }
}
