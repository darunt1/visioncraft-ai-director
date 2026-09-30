# VisionCraft

This Android APK uses a local Ollama backend at `http://localhost:11434/api/generate`.

## Setup

1. Install Ollama: https://ollama.com
2. Pull a model, for example:
   ```bash
   ollama pull llama3.2
   ```
3. Run the model locally:
   ```bash
   ollama serve
   ```
4. Open Android Studio and run the app on a device or emulator.

## Features

- Local AI scene generation using Ollama
- Prompt-driven cinematic storyboard output
- Jetpack Compose UI
- Works without external cloud APIs
