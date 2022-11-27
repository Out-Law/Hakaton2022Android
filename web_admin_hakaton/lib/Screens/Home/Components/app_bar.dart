import 'package:flutter/material.dart';
import 'package:flutter_svg/flutter_svg.dart';

class CustomAppBar extends StatelessWidget {
  const CustomAppBar({super.key});

  @override
  Widget build(BuildContext context) {
    return Container(
      margin: const EdgeInsets.all(20),
      padding: const EdgeInsets.all(20),
      decoration: BoxDecoration(
        color: Colors.white,
        borderRadius: BorderRadius.circular(46),
        boxShadow: [
          BoxShadow(
            offset: const Offset(0, -2),
            blurRadius: 30,
            color: Colors.black.withOpacity(0.16),
          ),
        ],
      ),
      child: Row(
        children: <Widget>[
          SvgPicture.asset(
            "assets/images/Logo.svg",
            width: 50,
            height: 50,
            color: Colors.black,
          ),
          const SizedBox(width: 5),
          Text(
            "Admin".toUpperCase(),
            style: const TextStyle(fontSize: 22, fontWeight: FontWeight.bold),
          ),
          const Spacer(),
          OutlinedButton.icon(
            label: const Text("Home"),
            onPressed: () {},
            icon: const Icon(Icons.add),
          ),
          OutlinedButton.icon(
            label: const Text("about"),
            onPressed: () {},
            icon: const Icon(Icons.add),
          ),
          OutlinedButton.icon(
            label: const Text("Pricing"),
            onPressed: () {},
            icon: const Icon(Icons.add),
          ),
          /*MenuItem(
            title: "Contact",
            press: () {},
          ),
          MenuItem(
            title: "Login",
            press: () {},
          ),*/
          OutlinedButton.icon(
            label: const Text("Get Started"),
            onPressed: () {}, icon: const Icon(Icons.add),
          ),
        ],
      ),
    );
  }
}
