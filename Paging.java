
public class Paging {

    private int pages;
    private int recordsPerPage;
    private int totalRecords;
    private int currentPage;
    
    public String getInfo()
    {
        String info = "";
        if(getCurrentPage() == (int) Math.ceil((double) getTotalRecords()/(double) getRecordsPerPage())) {
            info = getTotalRecords() + " items found | page: " +
                   getCurrentPage() + " of " + ((int) Math.ceil((double) getTotalRecords()/(double) getRecordsPerPage())) + " pages | " +
                   "showing items: " + ((getCurrentPage()-1)*getRecordsPerPage()+1) +
                   " thru " + (getTotalRecords()) +
                   "";
        } else {
            info = getTotalRecords() + " items found | page: " +
                   getCurrentPage() + " of " + ((int) Math.ceil((double) getTotalRecords()/(double) getRecordsPerPage())) + " pages | " +
                   "showing items: " + ((getCurrentPage()-1)*getRecordsPerPage()+1) +
                   " thru " + ((getCurrentPage())*getRecordsPerPage()) +
                   "";
        }
        return info;
    }
    
    public int moveToPrevPage()
    {
        if(currentPage-1 >= 1) {
            currentPage--;
            return currentPage;
        }
        
        else
            return -1;
    }

    public int moveToNextPage()
    {
        if(currentPage+1 <= pages) {
            currentPage++;
            return currentPage;
        }
        
        else
            return -1;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getRecordsPerPage() {
        return recordsPerPage;
    }

    public void setRecordsPerPage(int recordsPerPage) {
        this.recordsPerPage = recordsPerPage;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
