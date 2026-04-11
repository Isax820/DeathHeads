# 💻 Plateformes

[![Purpur](https://raw.githubusercontent.com/intergrav/devins-badges/v3/assets/cozy/supported/purpur_vector.svg)](https://purpurmc.org/)
[![Spigot](https://raw.githubusercontent.com/intergrav/devins-badges/v3/assets/cozy/supported/spigot_vector.svg)](https://www.spigotmc.org/)
[![Paper](https://raw.githubusercontent.com/intergrav/devins-badges/v3/assets/cozy/supported/paper_vector.svg)](https://papermc.io/downloads/paper)
[![Bukkit](https://raw.githubusercontent.com/intergrav/devins-badges/v3/assets/cozy/supported/bukkit_vector.svg)](https://dev.bukkit.org/)

---

# 💀 DeathHeads

Un plugin Minecraft simple et fun où les joueurs laissent leur tête à leur mort et accumulent des kills !

---

## ⚡ Fonctionnalités

- 💀 Drop de la tête du joueur à sa mort
- 🧠 Collection des têtes par joueur
- 🏆 Système de kills persistant
- 📊 Commande /topkills
- ⚙️ Configuration simple via config.yml

---

## 🧱 Commandes

| Commande | Description |
|----------|-------------|
| /topkills | Affiche le classement des meilleurs joueurs |

---

## 💡 Fonctionnement

### 💀 À la mort d'un joueur :
- Sa tête est drop au sol
- Elle est enregistrée dans sa collection
- Le killer gagne +1 kill

### 🏆 Système de kills :
- Les kills sont sauvegardés automatiquement
- Persistants après restart du serveur

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
1. Télécharge le plugin `.jar`
2. Place-le dans le dossier `plugins/`
3. Redémarre ton serveur
4. Configure `config.yml` si besoin

## 🛠️ Permissions
Aucune permission requise pour la version actuelle

## 🚀 Compatibilité
- PaperMC ✔
- Spigot ✔
- Minecraft 1.20+ ✔

## 📌 À venir
- 💰 Économie (vente de têtes)
- 🏆 GUI TopKills
- 💀 GUI collection de têtes
- ⚡ Kill streaks
- 💾 Base de données SQLite / MySQL

## ❤️ Auteur
Plugin développé pour serveurs survie / PvP personnalisés.
