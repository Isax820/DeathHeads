# 💻 Platforms

[![Purpur](https://raw.githubusercontent.com/intergrav/devins-badges/v3/assets/cozy/supported/purpur_vector.svg)](https://purpurmc.org/)
[![Spigot](https://raw.githubusercontent.com/intergrav/devins-badges/v3/assets/cozy/supported/spigot_vector.svg)](https://www.spigotmc.org/)
[ ![Paper](https://raw.githubusercontent.com/intergrav/devins-badges/v3/assets/cozy/supported/paper_vector.svg)](https://papermc.io/downloads/paper)
[![Bukkit](https://raw.githubusercontent.com/intergrav/devins-badges/v3/assets/cozy/supported/bukkit_vector.svg)](https://dev.bukkit.org/)

---

# 💀 DeathHeads

A simple and fun Minecraft plugin where players leave their heads behind when they die and rack up kills!

---

## ⚡ Features

- 💀 Player head drops upon death
- 🧠 Player head collection
- 🏆 Persistent kill system
- 📊 /topkills command
- ⚙️ Simple configuration via config.yml

---

## 🧱 Commands

| Command | Description |

|----------|-------------|

| /topkills | Displays the top player rankings |

---

## 💡 How it Works

### 💀 When a player dies:
- Their head is dropped to the ground
- It is saved to their collection
- The killer gains +1 kill

### 🏆 Kill System:
- Kills are saved automatically
- Persistent after server restart

---

## ⚙️ Configuration

```yml
head-drop:

enabled: true
chance: 100

kills:

enabled: true
```

## 📦 Installation
1. Download the `.jar` plugin
2. Place it in the `plugins/` folder
3. Restart your server
4. Configure `config.yml` if needed

## 🛠️ Permissions
No permissions required for the current version

## 🚀 Compatibility
- PaperMC ✔
- Spigot ✔
- Minecraft 1.21.11+ ✔

## 📌 Coming Soon
- 💰 Economy (Head Sales)
- 🏆 TopKills GUI
- 💀 Head Collection GUI
- ⚡ Kill Streaks
- 💾 SQLite/MySQL Database

## ❤️ Author
Plugin developed for custom survival/PvP servers.
