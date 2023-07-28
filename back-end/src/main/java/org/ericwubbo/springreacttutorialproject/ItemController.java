package org.ericwubbo.springreacttutorialproject;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/items")
public class ItemController {
    private final List<Item> items = new ArrayList<>(List.of(
            new Item("apples", "2.15"),
            new Item("pears", "4.30"),
            new Item("prunes", "1.23"),
            new Item("mangoes", "6.00"))
    );

    @GetMapping
    public List<Item> getAll() {
        return items;
    }

    @GetMapping("{id}")
    public Optional<Item> getById(@PathVariable("id") int id) {
        return id >= 0 && id < items.size() ? Optional.of(items.get(id)) : Optional.empty();
    }

    @PostMapping
    public void saveItem(@RequestBody Item item) {
        items.add(item);
    }
}
