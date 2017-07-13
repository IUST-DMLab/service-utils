package ir.ac.iust.dml.kg.resource.extractor.client;

import java.util.List;

/**
 * Descriotion of file
 *
 * @feature [issue_url] description
 * @bug [issue_url] description
 */
public class MatchedResource {
    private int start;
    private int end;
    private Resource resource;
  private List<Resource> ambiguities;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

  public List<Resource> getAmbiguities() {
        return ambiguities;
    }

  public void setAmbiguities(List<Resource> ambiguities) {
        this.ambiguities = ambiguities;
    }
}
