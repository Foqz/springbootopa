package com.kamil.springbootopa.controller;

import com.kamil.springbootopa.entity.Document;
import com.kamil.springbootopa.service.DocumentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DocumentController {
    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/{id}")
    public Document getDocument(@PathVariable long id) {
        return documentService.getDocumentById(id);
    }
}
