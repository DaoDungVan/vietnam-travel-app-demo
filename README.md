# Việt Nam Travel

Bài thực hành tuần 4 — Khoá "Lập Trình Android với Kotlin & Jetpack Compose 2026": màn hình khám phá địa điểm du lịch Việt Nam, dựng bằng Jetpack Compose.

## Nội dung

- **TopAppBar** hiển thị tên app.
- **Nổi bật**: `LazyRow` cuộn ngang 5 địa điểm có rating cao nhất, ảnh lớn kèm lớp phủ gradient và tên đè lên.
- **Tất cả địa điểm**: `LazyColumn` các `Card` gồm ảnh, tên, tỉnh/thành, nhãn vùng miền, thanh 5 sao và mô tả ngắn.
- Theme Material 3 riêng (xanh biển + cam, tiêu đề font serif), tắt dynamic color, hỗ trợ cả light/dark mode.

## Cấu trúc

```
app/src/main/
├── java/.../vietnamtravel/
│   ├── MainActivity.kt
│   ├── model/Place.kt             # Place, Region
│   ├── data/DataSource.kt         # 10 địa điểm mẫu
│   └── ui/
│       ├── TravelScreen.kt
│       ├── components/ (PlaceCard, FeaturedPlaceCard, RatingBar, RegionLabel)
│       └── theme/ (Color.kt, Type.kt, Theme.kt)
└── res/
    ├── drawable/ (10 ảnh địa điểm)
    └── values/strings.xml
```

## Ảnh địa điểm

10 ảnh phong cảnh thật đã được đưa vào `res/drawable/` (resize còn ~800–1000px chiều rộng, nén JPG/WebP, hầu hết dưới ~200 KB):

| File | Địa điểm |
|---|---|
| `ha_long.webp` | Vịnh Hạ Long |
| `sa_pa.jpg` | Sa Pa |
| `trang_an.jpg` | Tràng An |
| `hue.jpg` | Cố đô Huế |
| `hoi_an.webp` | Phố cổ Hội An |
| `phong_nha.jpg` | Phong Nha - Kẻ Bàng |
| `nha_trang.jpg` | Vịnh Nha Trang |
| `phu_quoc.webp` | Đảo Phú Quốc |
| `cai_rang.webp` | Chợ nổi Cái Răng |
| `cu_chi.jpg` | Địa đạo Củ Chi |

**TODO:** điền nguồn ảnh cụ thể (trang web / tác giả / giấy phép) cho từng ảnh ở đây trước khi nộp bài.

## Screenshot

- `screenshots/screenshot-light.png`
- `screenshots/screenshot-dark.png`

(Chụp sau khi chạy app trên emulator/thiết bị, ở cả chế độ sáng và tối.)
