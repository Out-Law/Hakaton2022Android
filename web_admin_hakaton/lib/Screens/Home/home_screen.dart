import 'package:flutter/material.dart';
import 'package:flutter_svg/flutter_svg.dart';
import 'package:web_admin_hakaton/Screens/Home/Components/app_bar.dart';
import 'package:web_admin_hakaton/Screens/Home/Components/body.dart';

class HomeScreen extends StatelessWidget {
  const HomeScreen({super.key});

  @override
  Widget build(BuildContext context) {
    Size size = MediaQuery.of(context).size;
    return Scaffold(
      body: Container(
        height: size.height,
        width: size.width,
        color: Colors.black,
        child: Stack(
          children: [
            Center(
              child: SvgPicture.asset(
                "assets/images/Logo.svg",
                width: 500,
                height: 500,
              ),
            ),
            Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: const <Widget>[
                CustomAppBar(),
                Spacer(),
                // It will cover 1/3 of free spaces
                Body(),
                Spacer(
                  flex: 2,
                ),
                // it will cover 2/3 of free spaces
              ],
            ),
          ],
        ),
      ),
    );
  }
}
