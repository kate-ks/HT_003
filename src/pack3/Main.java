package pack3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userKey;
        int keyPro = 9090;
        int keyExpert = 1808;

        Scanner in = new Scanner(System.in);
        System.out.print("Input a user Key: ");
        int key = in.nextInt();
        in.close();

        if (key==keyPro)
        {
            ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
            proDocumentWorker.editDocument();
            proDocumentWorker.saveDocument();
            proDocumentWorker.openDocument();
        }
        else if (key==keyExpert)
        {
            ExpertDocumentWorker expertDocumentWorker= new ExpertDocumentWorker();
            expertDocumentWorker.saveDocument();
            expertDocumentWorker.editDocument();
            expertDocumentWorker.openDocument();
        }
        else {
            DocumentWorker documentWorker = new DocumentWorker();
            documentWorker.editDocument();
            documentWorker.openDocument();
            documentWorker.saveDocument();
        }

    }

}
