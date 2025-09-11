class LinkListItem {
    private char _value;
    private LinkListItem _next;

    public LinkListItem(char value, LinkListItem next){
        _value = value;
        _next = next;
    }

    public char getValue() {
        return _value;
    }

    public LinkListItem get_next() {
        return _next;
    }
}


