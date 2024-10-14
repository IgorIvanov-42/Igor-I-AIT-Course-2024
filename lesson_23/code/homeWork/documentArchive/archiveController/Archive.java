package homeWork.documentArchive.archiveController;

import classWork.bookLibrary.model.Book;
import homeWork.documentArchive.documentModel.Document;

public class Archive {

    public long isbn;
    private Document[] documents;
    private int size;

    public Archive(Archive[] archives, int size) {
        this.documents = documents;
        this.size = size;
    }

    public Archive findArchive(long isbn){
        Archive foundDocuments = null;
        return foundDocuments;
    }

    public int size(){
        return size;
    }



}// end of class
