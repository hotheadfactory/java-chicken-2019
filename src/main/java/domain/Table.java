package domain;

import java.util.List;

public class Table {
    private final int number;
    private final int MAX_ORDER = 99;

    private List<Menu> menus;

    public Table(final int number) {
        this.number = number;
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
