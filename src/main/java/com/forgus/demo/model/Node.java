package com.forgus.demo.model;

import lombok.Data;

import java.util.List;

@Data
public class Node {
    private String value;
    private Node child;
    private List<Node> children;
}
