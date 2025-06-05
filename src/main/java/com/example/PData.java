package com.example;

import java.util.List;
import java.util.Arrays;

public class PData {
        public static List<Product> getSampleProducts() {
                return Arrays.asList(
                                new Product("4DFWD PULSE SHOES", "Adidas",
                                                "This product is excluded from all promotional discounts and offers.",
                                                160.0, "img1.png"),
                                new Product("FORUM MID SHOES", "Adidas",
                                                "This product is excluded from all promotional discounts and offers.",
                                                100.0, "img2.png"),
                                new Product("SUPERNOVA SHOES", "Adidas", "NMD City Stock 2", 150.0, "img3.png"),
                                new Product("ADIDAS SHOES", "Adidas", "NMD City Stock 2", 160.0, "img4.png"),
                                new Product("SUBA SHOES", "Adidas", "NMD City Stock 2", 120.0, "img5.png"),
                                new Product("4DFWD PULSE SHOES", "Adidas", "NMD City Stock 2", 160.0, "img6.png"),
                                new Product("Running Free 2", "Puma", "Perfect shoes for fast sprints and casual runs.",
                                                150.0, "img1.png"),
                                new Product("UltraBoost 21", "Adidas",
                                                "Engineered for energy return and long-distance running.", 180.0,
                                                "img2.png"),
                                new Product("VaporMax Flyknit 2020", "Nike",
                                                "Lightweight, responsive cushioning for runners.", 250.0, "img3.png"),
                                new Product("Yeezy Boost 350 V2", "Adidas", "Iconic sneakers with a modern twist.",
                                                320.0, "img4.png"),
                                new Product("OZWEEGO", "Adidas", "Retro-inspired shoes with modern comfort.", 135.0,
                                                "img5.png"),
                                new Product("NMD_R1", "Adidas", "Urban style shoes with Boost cushioning.", 175.0,
                                                "img6.png"));
        }
}
