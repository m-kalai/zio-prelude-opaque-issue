# zio-prelude-opaque-issue
Repo for testing and demonstration of "opaque" issue

When `issue.test.model#Whatever` type is just ordinary type alias, code compiles. When this same type becomes `opaque` type, code compilation fails with:
```
We were unable to read your assertion at compile-time.

You must either define your assertion directly or refer to other inline definitions:

    override inline def assertion = greaterThan(10) && lessThan(100).

    or

    inline def extracted = greaterThan(10) && lessThan(100).
    override inline def assertion = extracted.

```
It fails for both `CustomerId` and `CustomerName`.

This behaviour seems to be exclusive for package objects.
