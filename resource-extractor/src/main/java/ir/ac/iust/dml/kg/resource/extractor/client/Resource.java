package ir.ac.iust.dml.kg.resource.extractor.client;

import java.util.HashSet;
import java.util.Set;

/**
 * Descriotion of file
 *
 * @feature [issue_url] description
 * @bug [issue_url] description
 */
public class Resource {
    private final Set<String> classTree = new HashSet<>();
    private final Set<String> variantLabel = new HashSet<>();
    private final Set<String> disambiguatedFrom = new HashSet<>();
    private String iri;
    private String instanceOf;
    private String label;

    public String getIri() {
        return iri;
    }

    public void setIri(String iri) {
        this.iri = iri;
    }

    public String getInstanceOf() {
        return instanceOf;
    }

    public void setInstanceOf(String instanceOf) {
        this.instanceOf = instanceOf;
    }

    public Set<String> getClassTree() {
        return classTree;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Set<String> getVariantLabel() {
        return variantLabel;
    }

    public Set<String> getDisambiguatedFrom() {
        return disambiguatedFrom;
    }
}
