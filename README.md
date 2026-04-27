# 🌟 StarsGallery

StarsGallery is a sleek Android application that showcases a curated list of famous stars. It features a modern UI with a splash screen, smooth animations, and a searchable gallery of celebrities with their ratings and high-quality portraits.

## 🚀 Features

- **Dynamic Splash Screen**: A beautiful entry animation with rotation, scaling, and fading effects.
- **Star Gallery**: A RecyclerView-based list displaying celebrity names, photos, and ratings.
- **Real-time Search**: Easily filter through the stars using the built-in search functionality in the action bar.
- **Premium UI Components**: Uses `CircleImageView` for elegant portrait display and `Glide` for efficient image loading.
- **Clean Architecture**: Organized into `beans`, `service`, `adapter`, and `ui` packages for better maintainability.

## 🛠️ Technology Stack

- **Language**: Java
- **UI Framework**: Android XML Layouts
- **Libraries**:
    - [Glide](https://github.com/bumptech/glide): For image loading and caching.
    - [CircleImageView](https://github.com/hdodenhof/CircleImageView): For rounded profile pictures.
    - [Material Components](https://github.com/material-components/material-components-android): For modern UI elements.
- **SDK**: Compiled with Android SDK 37 (Targeting 37, Min SDK 26).

## 📸 Screenshots

| Splash Screen | Gallery List | Search Feature |
| :---: | :---: | :---: |
| ![Splash](https://via.placeholder.com/150?text=Splash) | ![List](https://via.placeholder.com/150?text=List) | ![Search](https://via.placeholder.com/150?text=Search) |

## 📦 Installation & Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/youness-lahdiri01/StarsGallery.git
   ```
2. **Open in Android Studio**:
   Import the project as a Gradle project.
3. **Sync Gradle**:
   Ensure all dependencies are downloaded.
4. **Run**:
   Select your device/emulator and click the 'Run' button.

## 🏗️ Project Structure

- `com.example.starsgallery.beans`: Contains the `Star` model.
- `com.example.starsgallery.dao`: Data Access Object interfaces.
- `com.example.starsgallery.service`: Business logic and data seeding (`StarService`).
- `com.example.starsgallery.adapter`: RecyclerView adapter (`StarAdapter`) for the list.
- `com.example.starsgallery.ui`: Activities for UI (`SplashActivity`, `ListActivity`).

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
Developed by **Youness Lahdiri** 🚀
