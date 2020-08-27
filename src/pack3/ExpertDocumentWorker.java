package pack3;

public class ExpertDocumentWorker extends ProDocumentWorker {

    @Override
    public void saveDocument() {
        super.saveDocument();
        System.out.println("Документ сохранен в новом формате.");
    }
}
