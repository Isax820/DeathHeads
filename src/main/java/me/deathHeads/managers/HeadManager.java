package me.deathHeads.managers;

import java.util.*;

public class HeadManager {

    private final Map<UUID, List<String>> heads = new HashMap<>();

    public void addHead(UUID owner, String deadPlayer) {
        heads.computeIfAbsent(owner, k -> new ArrayList<>()).add(deadPlayer);
    }

    public List<String> getHeads(UUID uuid) {
        return heads.getOrDefault(uuid, new ArrayList<>());
    }
}