import 'package:flutter/material.dart';

class DefaultButton extends StatelessWidget {
  final String text;
  final Function() press;
  const DefaultButton({
    required Key key,
    required this.text,
    required this.press,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return ClipRRect(
      borderRadius: BorderRadius.circular(25),
      child: OutlinedButton.icon(
        /*padding: EdgeInsets.symmetric(horizontal: 25, vertical: 15),
        color: kPrimaryColor,*/
        onPressed: press,
        label: Text(
          text.toUpperCase(),
        ),
        icon: const Icon(Icons.add),
      ),
    );
  }
}
